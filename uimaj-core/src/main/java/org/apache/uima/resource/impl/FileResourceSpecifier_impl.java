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

package org.apache.uima.resource.impl;

import org.apache.uima.resource.FileResourceSpecifier;
import org.apache.uima.resource.metadata.impl.MetaDataObject_impl;
import org.apache.uima.resource.metadata.impl.PropertyXmlInfo;
import org.apache.uima.resource.metadata.impl.XmlizationInfo;

/**
 * Reference implementation of {@link org.apache.uima.resource.FileResourceSpecifier}.
 * 
 * 
 */
public class FileResourceSpecifier_impl extends MetaDataObject_impl implements
        FileResourceSpecifier {

  static final long serialVersionUID = -4595981135298755811L;

  /** URL of the file. */
  private String mFileUrl;

  /** Filename of the local cache (null if none). */
  private String mLocalCache;

  /**
   * Creates a new <code>FileResourceSpecifier_impl</code>.
   */
  public FileResourceSpecifier_impl() {
  }

  /**
   * @see org.apache.uima.resource.FileResourceSpecifier#getFileUrl()
   */
  public String getFileUrl() {
    return mFileUrl;
  }

  /**
   * @see org.apache.uima.resource.FileResourceSpecifier#getFileUrl(String)
   */
  public void setFileUrl(String aUrl) {
    mFileUrl = aUrl;
  }

  /**
   * @see org.apache.uima.resource.FileResourceSpecifier#getLocalCache()
   */
  public String getLocalCache() {
    return mLocalCache;
  }

  /**
   * @see org.apache.uima.resource.FileResourceSpecifier#setLocalCache(String)
   */
  public void setLocalCache(String aFileName) {
    mLocalCache = aFileName;
  }

  protected XmlizationInfo getXmlizationInfo() {
    return XMLIZATION_INFO;
  }

  static final private XmlizationInfo XMLIZATION_INFO = new XmlizationInfo("fileResourceSpecifier",
          new PropertyXmlInfo[] { new PropertyXmlInfo("fileUrl"),
              new PropertyXmlInfo("localCache"), });
}