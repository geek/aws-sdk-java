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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/UpdateDocument"/>AWS API Documentation</a>
 */
public class UpdateDocumentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The content in a document that you want to update.
     * </p>
     */
    private String content;
    /**
     * <p>
     * The name of the document that you want to update.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The version of the document that you want to update.
     * </p>
     */
    private String documentVersion;

    /**
     * <p>
     * The content in a document that you want to update.
     * </p>
     * 
     * @param content
     *        The content in a document that you want to update.
     */

    public void setContent(String content) {
        this.content = content;
    }

    /**
     * <p>
     * The content in a document that you want to update.
     * </p>
     * 
     * @return The content in a document that you want to update.
     */

    public String getContent() {
        return this.content;
    }

    /**
     * <p>
     * The content in a document that you want to update.
     * </p>
     * 
     * @param content
     *        The content in a document that you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDocumentRequest withContent(String content) {
        setContent(content);
        return this;
    }

    /**
     * <p>
     * The name of the document that you want to update.
     * </p>
     * 
     * @param name
     *        The name of the document that you want to update.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the document that you want to update.
     * </p>
     * 
     * @return The name of the document that you want to update.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the document that you want to update.
     * </p>
     * 
     * @param name
     *        The name of the document that you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDocumentRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The version of the document that you want to update.
     * </p>
     * 
     * @param documentVersion
     *        The version of the document that you want to update.
     */

    public void setDocumentVersion(String documentVersion) {
        this.documentVersion = documentVersion;
    }

    /**
     * <p>
     * The version of the document that you want to update.
     * </p>
     * 
     * @return The version of the document that you want to update.
     */

    public String getDocumentVersion() {
        return this.documentVersion;
    }

    /**
     * <p>
     * The version of the document that you want to update.
     * </p>
     * 
     * @param documentVersion
     *        The version of the document that you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDocumentRequest withDocumentVersion(String documentVersion) {
        setDocumentVersion(documentVersion);
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
        if (getContent() != null)
            sb.append("Content: ").append(getContent()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDocumentVersion() != null)
            sb.append("DocumentVersion: ").append(getDocumentVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateDocumentRequest == false)
            return false;
        UpdateDocumentRequest other = (UpdateDocumentRequest) obj;
        if (other.getContent() == null ^ this.getContent() == null)
            return false;
        if (other.getContent() != null && other.getContent().equals(this.getContent()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDocumentVersion() == null ^ this.getDocumentVersion() == null)
            return false;
        if (other.getDocumentVersion() != null && other.getDocumentVersion().equals(this.getDocumentVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContent() == null) ? 0 : getContent().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDocumentVersion() == null) ? 0 : getDocumentVersion().hashCode());
        return hashCode;
    }

    @Override
    public UpdateDocumentRequest clone() {
        return (UpdateDocumentRequest) super.clone();
    }

}
