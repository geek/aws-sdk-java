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
package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;

public class UpdateGcmChannelResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    private GCMChannelResponse gCMChannelResponse;

    /**
     * @param gCMChannelResponse
     */

    public void setGCMChannelResponse(GCMChannelResponse gCMChannelResponse) {
        this.gCMChannelResponse = gCMChannelResponse;
    }

    /**
     * @return
     */

    public GCMChannelResponse getGCMChannelResponse() {
        return this.gCMChannelResponse;
    }

    /**
     * @param gCMChannelResponse
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateGcmChannelResult withGCMChannelResponse(GCMChannelResponse gCMChannelResponse) {
        setGCMChannelResponse(gCMChannelResponse);
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
        if (getGCMChannelResponse() != null)
            sb.append("GCMChannelResponse: ").append(getGCMChannelResponse());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateGcmChannelResult == false)
            return false;
        UpdateGcmChannelResult other = (UpdateGcmChannelResult) obj;
        if (other.getGCMChannelResponse() == null ^ this.getGCMChannelResponse() == null)
            return false;
        if (other.getGCMChannelResponse() != null && other.getGCMChannelResponse().equals(this.getGCMChannelResponse()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGCMChannelResponse() == null) ? 0 : getGCMChannelResponse().hashCode());
        return hashCode;
    }

    @Override
    public UpdateGcmChannelResult clone() {
        try {
            return (UpdateGcmChannelResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
