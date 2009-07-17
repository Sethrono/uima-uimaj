/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.apache.uima.cas.impl;

import org.apache.uima.cas.FSIndex;
import org.apache.uima.cas.FSIterator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.text.AnnotationFS;
import org.apache.uima.cas.text.AnnotationIndex;
import org.apache.uima.cas.text.AnnotationTree;

/**
 * Implementation of annotation indexes.
 * 
 * 
 */
public class AnnotationIndexImpl implements AnnotationIndex {

  private FSIndex<AnnotationFS> index;

  /**
   * 
   */
  public AnnotationIndexImpl(FSIndex<AnnotationFS> index) {
    super();
    this.index = index;
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.apache.uima.cas.FSIndex#size()
   */
  public int size() {
    return this.index.size();
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.apache.uima.cas.FSIndex#getType()
   */
  public Type getType() {
    return this.index.getType();
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.apache.uima.cas.FSIndex#contains(org.apache.uima.cas.FeatureStructure)
   */
  public boolean contains(FeatureStructure fs) {
    return this.index.contains(fs);
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.apache.uima.cas.FSIndex#find(org.apache.uima.cas.FeatureStructure)
   */
  public FeatureStructure find(FeatureStructure fs) {
    return this.index.find(fs);
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.apache.uima.cas.FSIndex#compare(org.apache.uima.cas.FeatureStructure,
   *      org.apache.uima.cas.FeatureStructure)
   */
  public int compare(FeatureStructure fs1, FeatureStructure fs2) {
    return this.index.compare(fs1, fs2);
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.apache.uima.cas.FSIndex#iterator()
   */
  public FSIterator<AnnotationFS> iterator() {
    return this.index.iterator();
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.apache.uima.cas.FSIndex#iterator(org.apache.uima.cas.FeatureStructure)
   */
  public FSIterator<AnnotationFS> iterator(FeatureStructure fs) {
    return this.index.iterator(fs);
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.apache.uima.cas.FSIndex#getIndexingStrategy()
   */
  public int getIndexingStrategy() {
    return this.index.getIndexingStrategy();
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.apache.uima.cas.text.AnnotationIndex#iterator(boolean)
   */
  public FSIterator<AnnotationFS> iterator(boolean ambiguous) {
    if (ambiguous) {
      return this.index.iterator();
    }
    return new Subiterator<AnnotationFS>(this.index.iterator());
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.apache.uima.cas.text.AnnotationIndex#subiterator(org.apache.uima.cas.text.AnnotationFS)
   */
  public FSIterator<AnnotationFS> subiterator(AnnotationFS annot) {
    return subiterator(annot, true, true);
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.apache.uima.cas.text.AnnotationIndex#subiterator(org.apache.uima.cas.text.AnnotationFS,
   *      boolean, boolean)
   */
  public FSIterator<AnnotationFS> subiterator(AnnotationFS annot, boolean ambiguous, boolean strict) {
    return new Subiterator<AnnotationFS>(this.index.iterator(), annot, ambiguous, strict);
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.apache.uima.cas.text.AnnotationIndex#tree(org.apache.uima.cas.text.AnnotationFS)
   */
  public AnnotationTree tree(AnnotationFS annot) {
    AnnotationTreeImpl tree = new AnnotationTreeImpl();
    AnnotationTreeNodeImpl root = new AnnotationTreeNodeImpl();
    tree.setRoot(root);
    root.set(annot);
    addChildren(root, subiterator(annot, false, true));
    return tree;
  }

  private void addChildren(AnnotationTreeNodeImpl node, FSIterator<AnnotationFS> it) {
    AnnotationTreeNodeImpl dtr;
    AnnotationFS annot;
    while (it.isValid()) {
      annot = (AnnotationFS) it.get();
      it.moveToNext();
      dtr = new AnnotationTreeNodeImpl();
      dtr.set(annot);
      node.addChild(dtr);
      addChildren(dtr, subiterator(annot, false, true));
    }
  }

}
