/**
 */
package net.opengis.gml311;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.w3.xlink.ActuateType;
import org.w3.xlink.ShowType;
import org.w3.xlink.TypeType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Geometric Primitive Property Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A property that has a geometric primitive as its value domain can either be an appropriate geometry element 
 * 			encapsulated in an element of this type or an XLink reference to a remote geometry element (where remote includes geometry 
 * 			elements located elsewhere in the same document). Either the reference or the contained element must be given, but neither 
 * 			both nor none.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml311.GeometricPrimitivePropertyType#getGeometricPrimitiveGroup <em>Geometric Primitive Group</em>}</li>
 *   <li>{@link net.opengis.gml311.GeometricPrimitivePropertyType#getGeometricPrimitive <em>Geometric Primitive</em>}</li>
 *   <li>{@link net.opengis.gml311.GeometricPrimitivePropertyType#getActuate <em>Actuate</em>}</li>
 *   <li>{@link net.opengis.gml311.GeometricPrimitivePropertyType#getArcrole <em>Arcrole</em>}</li>
 *   <li>{@link net.opengis.gml311.GeometricPrimitivePropertyType#getHref <em>Href</em>}</li>
 *   <li>{@link net.opengis.gml311.GeometricPrimitivePropertyType#getRemoteSchema <em>Remote Schema</em>}</li>
 *   <li>{@link net.opengis.gml311.GeometricPrimitivePropertyType#getRole <em>Role</em>}</li>
 *   <li>{@link net.opengis.gml311.GeometricPrimitivePropertyType#getShow <em>Show</em>}</li>
 *   <li>{@link net.opengis.gml311.GeometricPrimitivePropertyType#getTitle <em>Title</em>}</li>
 *   <li>{@link net.opengis.gml311.GeometricPrimitivePropertyType#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml311.Gml311Package#getGeometricPrimitivePropertyType()
 * @model extendedMetaData="name='GeometricPrimitivePropertyType' kind='elementOnly'"
 * @generated
 */
public interface GeometricPrimitivePropertyType extends EObject {
    /**
     * Returns the value of the '<em><b>Geometric Primitive Group</b></em>' attribute list.
     * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The "_GeometricPrimitive" element is the abstract head of the substituition group for all (pre- and user-defined) 
     * 			geometric primitives.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Geometric Primitive Group</em>' attribute list.
     * @see net.opengis.gml311.Gml311Package#getGeometricPrimitivePropertyType_GeometricPrimitiveGroup()
     * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
     *        extendedMetaData="kind='group' name='_GeometricPrimitive:group' namespace='##targetNamespace'"
     * @generated
     */
    FeatureMap getGeometricPrimitiveGroup();

    /**
     * Returns the value of the '<em><b>Geometric Primitive</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The "_GeometricPrimitive" element is the abstract head of the substituition group for all (pre- and user-defined) 
     * 			geometric primitives.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Geometric Primitive</em>' containment reference.
     * @see net.opengis.gml311.Gml311Package#getGeometricPrimitivePropertyType_GeometricPrimitive()
     * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='_GeometricPrimitive' namespace='##targetNamespace' group='_GeometricPrimitive:group'"
     * @generated
     */
    AbstractGeometricPrimitiveType getGeometricPrimitive();

    /**
     * Returns the value of the '<em><b>Actuate</b></em>' attribute.
     * The literals are from the enumeration {@link org.w3.xlink.ActuateType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Actuate</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Actuate</em>' attribute.
     * @see org.w3.xlink.ActuateType
     * @see #isSetActuate()
     * @see #unsetActuate()
     * @see #setActuate(ActuateType)
     * @see net.opengis.gml311.Gml311Package#getGeometricPrimitivePropertyType_Actuate()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='actuate' namespace='http://www.w3.org/1999/xlink'"
     * @generated
     */
    ActuateType getActuate();

    /**
     * Sets the value of the '{@link net.opengis.gml311.GeometricPrimitivePropertyType#getActuate <em>Actuate</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Actuate</em>' attribute.
     * @see org.w3.xlink.ActuateType
     * @see #isSetActuate()
     * @see #unsetActuate()
     * @see #getActuate()
     * @generated
     */
    void setActuate(ActuateType value);

    /**
     * Unsets the value of the '{@link net.opengis.gml311.GeometricPrimitivePropertyType#getActuate <em>Actuate</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetActuate()
     * @see #getActuate()
     * @see #setActuate(ActuateType)
     * @generated
     */
    void unsetActuate();

    /**
     * Returns whether the value of the '{@link net.opengis.gml311.GeometricPrimitivePropertyType#getActuate <em>Actuate</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Actuate</em>' attribute is set.
     * @see #unsetActuate()
     * @see #getActuate()
     * @see #setActuate(ActuateType)
     * @generated
     */
    boolean isSetActuate();

    /**
     * Returns the value of the '<em><b>Arcrole</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Arcrole</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Arcrole</em>' attribute.
     * @see #setArcrole(String)
     * @see net.opengis.gml311.Gml311Package#getGeometricPrimitivePropertyType_Arcrole()
     * @model dataType="org.w3.xlink.ArcroleType"
     *        extendedMetaData="kind='attribute' name='arcrole' namespace='http://www.w3.org/1999/xlink'"
     * @generated
     */
    String getArcrole();

    /**
     * Sets the value of the '{@link net.opengis.gml311.GeometricPrimitivePropertyType#getArcrole <em>Arcrole</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Arcrole</em>' attribute.
     * @see #getArcrole()
     * @generated
     */
    void setArcrole(String value);

    /**
     * Returns the value of the '<em><b>Href</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Href</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Href</em>' attribute.
     * @see #setHref(String)
     * @see net.opengis.gml311.Gml311Package#getGeometricPrimitivePropertyType_Href()
     * @model dataType="org.w3.xlink.HrefType"
     *        extendedMetaData="kind='attribute' name='href' namespace='http://www.w3.org/1999/xlink'"
     * @generated
     */
    String getHref();

    /**
     * Sets the value of the '{@link net.opengis.gml311.GeometricPrimitivePropertyType#getHref <em>Href</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Href</em>' attribute.
     * @see #getHref()
     * @generated
     */
    void setHref(String value);

    /**
     * Returns the value of the '<em><b>Remote Schema</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Reference to an XML Schema fragment that specifies the content model of the propertys value. This is in conformance with the XML Schema Section 4.14 Referencing Schemas from Elsewhere.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Remote Schema</em>' attribute.
     * @see #setRemoteSchema(String)
     * @see net.opengis.gml311.Gml311Package#getGeometricPrimitivePropertyType_RemoteSchema()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
     *        extendedMetaData="kind='attribute' name='remoteSchema' namespace='##targetNamespace'"
     * @generated
     */
    String getRemoteSchema();

    /**
     * Sets the value of the '{@link net.opengis.gml311.GeometricPrimitivePropertyType#getRemoteSchema <em>Remote Schema</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Remote Schema</em>' attribute.
     * @see #getRemoteSchema()
     * @generated
     */
    void setRemoteSchema(String value);

    /**
     * Returns the value of the '<em><b>Role</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Role</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Role</em>' attribute.
     * @see #setRole(String)
     * @see net.opengis.gml311.Gml311Package#getGeometricPrimitivePropertyType_Role()
     * @model dataType="org.w3.xlink.RoleType"
     *        extendedMetaData="kind='attribute' name='role' namespace='http://www.w3.org/1999/xlink'"
     * @generated
     */
    String getRole();

    /**
     * Sets the value of the '{@link net.opengis.gml311.GeometricPrimitivePropertyType#getRole <em>Role</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Role</em>' attribute.
     * @see #getRole()
     * @generated
     */
    void setRole(String value);

    /**
     * Returns the value of the '<em><b>Show</b></em>' attribute.
     * The literals are from the enumeration {@link org.w3.xlink.ShowType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Show</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Show</em>' attribute.
     * @see org.w3.xlink.ShowType
     * @see #isSetShow()
     * @see #unsetShow()
     * @see #setShow(ShowType)
     * @see net.opengis.gml311.Gml311Package#getGeometricPrimitivePropertyType_Show()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='show' namespace='http://www.w3.org/1999/xlink'"
     * @generated
     */
    ShowType getShow();

    /**
     * Sets the value of the '{@link net.opengis.gml311.GeometricPrimitivePropertyType#getShow <em>Show</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Show</em>' attribute.
     * @see org.w3.xlink.ShowType
     * @see #isSetShow()
     * @see #unsetShow()
     * @see #getShow()
     * @generated
     */
    void setShow(ShowType value);

    /**
     * Unsets the value of the '{@link net.opengis.gml311.GeometricPrimitivePropertyType#getShow <em>Show</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetShow()
     * @see #getShow()
     * @see #setShow(ShowType)
     * @generated
     */
    void unsetShow();

    /**
     * Returns whether the value of the '{@link net.opengis.gml311.GeometricPrimitivePropertyType#getShow <em>Show</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Show</em>' attribute is set.
     * @see #unsetShow()
     * @see #getShow()
     * @see #setShow(ShowType)
     * @generated
     */
    boolean isSetShow();

    /**
     * Returns the value of the '<em><b>Title</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Title</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Title</em>' attribute.
     * @see #setTitle(String)
     * @see net.opengis.gml311.Gml311Package#getGeometricPrimitivePropertyType_Title()
     * @model dataType="org.w3.xlink.TitleAttrType"
     *        extendedMetaData="kind='attribute' name='title' namespace='http://www.w3.org/1999/xlink'"
     * @generated
     */
    String getTitle();

    /**
     * Sets the value of the '{@link net.opengis.gml311.GeometricPrimitivePropertyType#getTitle <em>Title</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Title</em>' attribute.
     * @see #getTitle()
     * @generated
     */
    void setTitle(String value);

    /**
     * Returns the value of the '<em><b>Type</b></em>' attribute.
     * The default value is <code>"simple"</code>.
     * The literals are from the enumeration {@link org.w3.xlink.TypeType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' attribute.
     * @see org.w3.xlink.TypeType
     * @see #isSetType()
     * @see #unsetType()
     * @see #setType(TypeType)
     * @see net.opengis.gml311.Gml311Package#getGeometricPrimitivePropertyType_Type()
     * @model default="simple" unsettable="true"
     *        extendedMetaData="kind='attribute' name='type' namespace='http://www.w3.org/1999/xlink'"
     * @generated
     */
    TypeType getType();

    /**
     * Sets the value of the '{@link net.opengis.gml311.GeometricPrimitivePropertyType#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see org.w3.xlink.TypeType
     * @see #isSetType()
     * @see #unsetType()
     * @see #getType()
     * @generated
     */
    void setType(TypeType value);

    /**
     * Unsets the value of the '{@link net.opengis.gml311.GeometricPrimitivePropertyType#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetType()
     * @see #getType()
     * @see #setType(TypeType)
     * @generated
     */
    void unsetType();

    /**
     * Returns whether the value of the '{@link net.opengis.gml311.GeometricPrimitivePropertyType#getType <em>Type</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Type</em>' attribute is set.
     * @see #unsetType()
     * @see #getType()
     * @see #setType(TypeType)
     * @generated
     */
    boolean isSetType();

} // GeometricPrimitivePropertyType
