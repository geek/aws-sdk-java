/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;

/**
 * <p>
 * The inventory item schema definition. Users can use this to compose inventory query filters.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/InventoryItemSchema"/>AWS API Documentation</a>
 */
public class InventoryItemSchema implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the inventory type. Default inventory item type names start with <code>AWS</code>. Custom inventory
     * type names will start with <code>Custom</code>. Default inventory item types include the following:
     * <code>AWS:AWSComponent</code>, <code>AWS:Application</code>, <code>AWS:InstanceInformation</code>,
     * <code>AWS:Network</code>, and <code>AWS:WindowsUpdate</code>.
     * </p>
     */
    private String typeName;
    /**
     * <p>
     * The schema version for the inventory item.
     * </p>
     */
    private String version;
    /**
     * <p>
     * The schema attributes for inventory. This contains data type and attribute name.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<InventoryItemAttribute> attributes;

    /**
     * <p>
     * The name of the inventory type. Default inventory item type names start with <code>AWS</code>. Custom inventory
     * type names will start with <code>Custom</code>. Default inventory item types include the following:
     * <code>AWS:AWSComponent</code>, <code>AWS:Application</code>, <code>AWS:InstanceInformation</code>,
     * <code>AWS:Network</code>, and <code>AWS:WindowsUpdate</code>.
     * </p>
     * 
     * @param typeName
     *        The name of the inventory type. Default inventory item type names start with <code>AWS</code>. Custom
     *        inventory type names will start with <code>Custom</code>. Default inventory item types include the
     *        following: <code>AWS:AWSComponent</code>, <code>AWS:Application</code>,
     *        <code>AWS:InstanceInformation</code>, <code>AWS:Network</code>, and <code>AWS:WindowsUpdate</code>.
     */

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    /**
     * <p>
     * The name of the inventory type. Default inventory item type names start with <code>AWS</code>. Custom inventory
     * type names will start with <code>Custom</code>. Default inventory item types include the following:
     * <code>AWS:AWSComponent</code>, <code>AWS:Application</code>, <code>AWS:InstanceInformation</code>,
     * <code>AWS:Network</code>, and <code>AWS:WindowsUpdate</code>.
     * </p>
     * 
     * @return The name of the inventory type. Default inventory item type names start with <code>AWS</code>. Custom
     *         inventory type names will start with <code>Custom</code>. Default inventory item types include the
     *         following: <code>AWS:AWSComponent</code>, <code>AWS:Application</code>,
     *         <code>AWS:InstanceInformation</code>, <code>AWS:Network</code>, and <code>AWS:WindowsUpdate</code>.
     */

    public String getTypeName() {
        return this.typeName;
    }

    /**
     * <p>
     * The name of the inventory type. Default inventory item type names start with <code>AWS</code>. Custom inventory
     * type names will start with <code>Custom</code>. Default inventory item types include the following:
     * <code>AWS:AWSComponent</code>, <code>AWS:Application</code>, <code>AWS:InstanceInformation</code>,
     * <code>AWS:Network</code>, and <code>AWS:WindowsUpdate</code>.
     * </p>
     * 
     * @param typeName
     *        The name of the inventory type. Default inventory item type names start with <code>AWS</code>. Custom
     *        inventory type names will start with <code>Custom</code>. Default inventory item types include the
     *        following: <code>AWS:AWSComponent</code>, <code>AWS:Application</code>,
     *        <code>AWS:InstanceInformation</code>, <code>AWS:Network</code>, and <code>AWS:WindowsUpdate</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InventoryItemSchema withTypeName(String typeName) {
        setTypeName(typeName);
        return this;
    }

    /**
     * <p>
     * The schema version for the inventory item.
     * </p>
     * 
     * @param version
     *        The schema version for the inventory item.
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The schema version for the inventory item.
     * </p>
     * 
     * @return The schema version for the inventory item.
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The schema version for the inventory item.
     * </p>
     * 
     * @param version
     *        The schema version for the inventory item.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InventoryItemSchema withVersion(String version) {
        setVersion(version);
        return this;
    }

    /**
     * <p>
     * The schema attributes for inventory. This contains data type and attribute name.
     * </p>
     * 
     * @return The schema attributes for inventory. This contains data type and attribute name.
     */

    public java.util.List<InventoryItemAttribute> getAttributes() {
        if (attributes == null) {
            attributes = new com.amazonaws.internal.SdkInternalList<InventoryItemAttribute>();
        }
        return attributes;
    }

    /**
     * <p>
     * The schema attributes for inventory. This contains data type and attribute name.
     * </p>
     * 
     * @param attributes
     *        The schema attributes for inventory. This contains data type and attribute name.
     */

    public void setAttributes(java.util.Collection<InventoryItemAttribute> attributes) {
        if (attributes == null) {
            this.attributes = null;
            return;
        }

        this.attributes = new com.amazonaws.internal.SdkInternalList<InventoryItemAttribute>(attributes);
    }

    /**
     * <p>
     * The schema attributes for inventory. This contains data type and attribute name.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAttributes(java.util.Collection)} or {@link #withAttributes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param attributes
     *        The schema attributes for inventory. This contains data type and attribute name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InventoryItemSchema withAttributes(InventoryItemAttribute... attributes) {
        if (this.attributes == null) {
            setAttributes(new com.amazonaws.internal.SdkInternalList<InventoryItemAttribute>(attributes.length));
        }
        for (InventoryItemAttribute ele : attributes) {
            this.attributes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The schema attributes for inventory. This contains data type and attribute name.
     * </p>
     * 
     * @param attributes
     *        The schema attributes for inventory. This contains data type and attribute name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InventoryItemSchema withAttributes(java.util.Collection<InventoryItemAttribute> attributes) {
        setAttributes(attributes);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getTypeName() != null)
            sb.append("TypeName: ").append(getTypeName()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion()).append(",");
        if (getAttributes() != null)
            sb.append("Attributes: ").append(getAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InventoryItemSchema == false)
            return false;
        InventoryItemSchema other = (InventoryItemSchema) obj;
        if (other.getTypeName() == null ^ this.getTypeName() == null)
            return false;
        if (other.getTypeName() != null && other.getTypeName().equals(this.getTypeName()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTypeName() == null) ? 0 : getTypeName().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        return hashCode;
    }

    @Override
    public InventoryItemSchema clone() {
        try {
            return (InventoryItemSchema) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
