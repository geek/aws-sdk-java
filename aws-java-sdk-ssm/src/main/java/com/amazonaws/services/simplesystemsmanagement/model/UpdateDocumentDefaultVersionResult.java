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
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/UpdateDocumentDefaultVersion"/>AWS API
 *      Documentation</a>
 */
public class UpdateDocumentDefaultVersionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The description of a custom document that you want to set as the default version.
     * </p>
     */
    private DocumentDefaultVersionDescription description;

    /**
     * <p>
     * The description of a custom document that you want to set as the default version.
     * </p>
     * 
     * @param description
     *        The description of a custom document that you want to set as the default version.
     */

    public void setDescription(DocumentDefaultVersionDescription description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of a custom document that you want to set as the default version.
     * </p>
     * 
     * @return The description of a custom document that you want to set as the default version.
     */

    public DocumentDefaultVersionDescription getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of a custom document that you want to set as the default version.
     * </p>
     * 
     * @param description
     *        The description of a custom document that you want to set as the default version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDocumentDefaultVersionResult withDescription(DocumentDefaultVersionDescription description) {
        setDescription(description);
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateDocumentDefaultVersionResult == false)
            return false;
        UpdateDocumentDefaultVersionResult other = (UpdateDocumentDefaultVersionResult) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public UpdateDocumentDefaultVersionResult clone() {
        try {
            return (UpdateDocumentDefaultVersionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
