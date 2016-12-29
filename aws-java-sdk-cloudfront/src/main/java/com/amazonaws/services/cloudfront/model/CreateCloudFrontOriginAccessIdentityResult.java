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
package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;

/**
 * <p>
 * The returned result of the corresponding request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2016-11-25/CreateCloudFrontOriginAccessIdentity"/>AWS
 *      API Documentation</a>
 */
public class CreateCloudFrontOriginAccessIdentityResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The origin access identity's information.
     * </p>
     */
    private CloudFrontOriginAccessIdentity cloudFrontOriginAccessIdentity;
    /**
     * <p>
     * The fully qualified URI of the new origin access identity just created. For example:
     * <code>https://cloudfront.amazonaws.com/2010-11-01/origin-access-identity/cloudfront/E74FTE3AJFJ256A</code>.
     * </p>
     */
    private String location;
    /**
     * <p>
     * The current version of the origin access identity created.
     * </p>
     */
    private String eTag;

    /**
     * <p>
     * The origin access identity's information.
     * </p>
     * 
     * @param cloudFrontOriginAccessIdentity
     *        The origin access identity's information.
     */

    public void setCloudFrontOriginAccessIdentity(CloudFrontOriginAccessIdentity cloudFrontOriginAccessIdentity) {
        this.cloudFrontOriginAccessIdentity = cloudFrontOriginAccessIdentity;
    }

    /**
     * <p>
     * The origin access identity's information.
     * </p>
     * 
     * @return The origin access identity's information.
     */

    public CloudFrontOriginAccessIdentity getCloudFrontOriginAccessIdentity() {
        return this.cloudFrontOriginAccessIdentity;
    }

    /**
     * <p>
     * The origin access identity's information.
     * </p>
     * 
     * @param cloudFrontOriginAccessIdentity
     *        The origin access identity's information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCloudFrontOriginAccessIdentityResult withCloudFrontOriginAccessIdentity(CloudFrontOriginAccessIdentity cloudFrontOriginAccessIdentity) {
        setCloudFrontOriginAccessIdentity(cloudFrontOriginAccessIdentity);
        return this;
    }

    /**
     * <p>
     * The fully qualified URI of the new origin access identity just created. For example:
     * <code>https://cloudfront.amazonaws.com/2010-11-01/origin-access-identity/cloudfront/E74FTE3AJFJ256A</code>.
     * </p>
     * 
     * @param location
     *        The fully qualified URI of the new origin access identity just created. For example:
     *        <code>https://cloudfront.amazonaws.com/2010-11-01/origin-access-identity/cloudfront/E74FTE3AJFJ256A</code>
     *        .
     */

    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * <p>
     * The fully qualified URI of the new origin access identity just created. For example:
     * <code>https://cloudfront.amazonaws.com/2010-11-01/origin-access-identity/cloudfront/E74FTE3AJFJ256A</code>.
     * </p>
     * 
     * @return The fully qualified URI of the new origin access identity just created. For example:
     *         <code>https://cloudfront.amazonaws.com/2010-11-01/origin-access-identity/cloudfront/E74FTE3AJFJ256A</code>
     *         .
     */

    public String getLocation() {
        return this.location;
    }

    /**
     * <p>
     * The fully qualified URI of the new origin access identity just created. For example:
     * <code>https://cloudfront.amazonaws.com/2010-11-01/origin-access-identity/cloudfront/E74FTE3AJFJ256A</code>.
     * </p>
     * 
     * @param location
     *        The fully qualified URI of the new origin access identity just created. For example:
     *        <code>https://cloudfront.amazonaws.com/2010-11-01/origin-access-identity/cloudfront/E74FTE3AJFJ256A</code>
     *        .
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCloudFrontOriginAccessIdentityResult withLocation(String location) {
        setLocation(location);
        return this;
    }

    /**
     * <p>
     * The current version of the origin access identity created.
     * </p>
     * 
     * @param eTag
     *        The current version of the origin access identity created.
     */

    public void setETag(String eTag) {
        this.eTag = eTag;
    }

    /**
     * <p>
     * The current version of the origin access identity created.
     * </p>
     * 
     * @return The current version of the origin access identity created.
     */

    public String getETag() {
        return this.eTag;
    }

    /**
     * <p>
     * The current version of the origin access identity created.
     * </p>
     * 
     * @param eTag
     *        The current version of the origin access identity created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCloudFrontOriginAccessIdentityResult withETag(String eTag) {
        setETag(eTag);
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
        if (getCloudFrontOriginAccessIdentity() != null)
            sb.append("CloudFrontOriginAccessIdentity: ").append(getCloudFrontOriginAccessIdentity()).append(",");
        if (getLocation() != null)
            sb.append("Location: ").append(getLocation()).append(",");
        if (getETag() != null)
            sb.append("ETag: ").append(getETag());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateCloudFrontOriginAccessIdentityResult == false)
            return false;
        CreateCloudFrontOriginAccessIdentityResult other = (CreateCloudFrontOriginAccessIdentityResult) obj;
        if (other.getCloudFrontOriginAccessIdentity() == null ^ this.getCloudFrontOriginAccessIdentity() == null)
            return false;
        if (other.getCloudFrontOriginAccessIdentity() != null
                && other.getCloudFrontOriginAccessIdentity().equals(this.getCloudFrontOriginAccessIdentity()) == false)
            return false;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        if (other.getETag() == null ^ this.getETag() == null)
            return false;
        if (other.getETag() != null && other.getETag().equals(this.getETag()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCloudFrontOriginAccessIdentity() == null) ? 0 : getCloudFrontOriginAccessIdentity().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        hashCode = prime * hashCode + ((getETag() == null) ? 0 : getETag().hashCode());
        return hashCode;
    }

    @Override
    public CreateCloudFrontOriginAccessIdentityResult clone() {
        try {
            return (CreateCloudFrontOriginAccessIdentityResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
