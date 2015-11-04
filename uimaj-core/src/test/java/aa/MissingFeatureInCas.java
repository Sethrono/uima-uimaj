

   
/* Apache UIMA v3 - First created by JCasGen Tue Nov 03 16:59:32 EST 2015 */

package aa;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;

import org.apache.uima.jcas.cas.TOP;


/** 
 * Updated by JCasGen Tue Nov 03 16:59:32 EST 2015
 * XML source: C:/au/svnCheckouts/branches/uimaj/experiment-v3-jcas/uimaj-core/src/test/java/org/apache/uima/jcas/test/generatedx.xml
 * @generated */
public class MissingFeatureInCas extends TOP {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(MissingFeatureInCas.class);
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
  private final static int _FI_haveThisOne = JCasRegistry.registerFeature();
  private final static int _FI_missingThisOne = JCasRegistry.registerFeature();
  private final static int _FI_changedFType = JCasRegistry.registerFeature();

   
  private int _F_haveThisOne;  // 
  private float _F_missingThisOne;  // 
  private String _F_changedFType;  // 
 
  /** Never called.  Disable default constructor
   * @generated */
  protected MissingFeatureInCas() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public MissingFeatureInCas(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public MissingFeatureInCas(JCas jcas) {
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
  //* Feature: haveThisOne

  /** getter for haveThisOne - gets 
   * @generated
   * @return value of the feature 
   */
  public int getHaveThisOne() { return _F_haveThisOne;}
    
  /** setter for haveThisOne - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setHaveThisOne(int v) {
              _casView.setWithCheckAndJournalJFRI(this, _FI_haveThisOne, () -> _F_haveThisOne = v);
      }    
   
    
  //*--------------*
  //* Feature: missingThisOne

  /** getter for missingThisOne - gets 
   * @generated
   * @return value of the feature 
   */
  public float getMissingThisOne() { return _F_missingThisOne;}
    
  /** setter for missingThisOne - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setMissingThisOne(float v) {
              _casView.setWithCheckAndJournalJFRI(this, _FI_missingThisOne, () -> _F_missingThisOne = v);
      }    
   
    
  //*--------------*
  //* Feature: changedFType

  /** getter for changedFType - gets 
   * @generated
   * @return value of the feature 
   */
  public String getChangedFType() { return _F_changedFType;}
    
  /** setter for changedFType - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setChangedFType(String v) {
              _casView.setWithCheckAndJournalJFRI(this, _FI_changedFType, () -> _F_changedFType = v);
      }    
  }

    