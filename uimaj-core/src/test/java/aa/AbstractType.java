

   
/* Apache UIMA v3 - First created by JCasGen Tue Nov 03 17:48:38 EST 2015 */

package aa;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;

import org.apache.uima.jcas.cas.TOP;


/** 
 * Updated by JCasGen Tue Nov 03 17:48:38 EST 2015
 * XML source: C:/au/svnCheckouts/branches/uimaj/experiment-v3-jcas/uimaj-core/src/test/java/org/apache/uima/jcas/test/generatedx.xml
 * @generated */
public class AbstractType extends TOP {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(AbstractType.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated
   * @return index of the type  
   */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
 
  /* *****************
   *    Local Data   *
   * *****************/ 
   
  /* Register Features */
  public final static int _FI_abstractInt = JCasRegistry.registerFeature(typeIndexID);

   
  private int _F_abstractInt;  // 
 
  /** Never called.  Disable default constructor
   * @generated */
  protected AbstractType() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public AbstractType(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public AbstractType(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** 
   * <!-- begin-user-doc -->
   * Write your own initialization here
   * <!-- end-user-doc -->
   *
   * @generated modifiable 
   */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: abstractInt

  /** getter for abstractInt - gets 
   * @generated
   * @return value of the feature 
   */
  public int getAbstractInt() { return _F_abstractInt;}
    
  /** setter for abstractInt - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setAbstractInt(int v) {
              _casView.setWithCheckAndJournalJFRI(this, _FI_abstractInt, () -> _F_abstractInt = v);
      }    
  }

    