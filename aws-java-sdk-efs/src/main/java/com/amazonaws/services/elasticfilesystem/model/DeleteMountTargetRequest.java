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
package com.amazonaws.services.elasticfilesystem.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticfilesystem-2015-02-01/DeleteMountTarget"/>AWS API
 *      Documentation</a>
 */
public class DeleteMountTargetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * ID of the mount target to delete (String).
     * </p>
     */
    private String mountTargetId;

    /**
     * <p>
     * ID of the mount target to delete (String).
     * </p>
     * 
     * @param mountTargetId
     *        ID of the mount target to delete (String).
     */

    public void setMountTargetId(String mountTargetId) {
        this.mountTargetId = mountTargetId;
    }

    /**
     * <p>
     * ID of the mount target to delete (String).
     * </p>
     * 
     * @return ID of the mount target to delete (String).
     */

    public String getMountTargetId() {
        return this.mountTargetId;
    }

    /**
     * <p>
     * ID of the mount target to delete (String).
     * </p>
     * 
     * @param mountTargetId
     *        ID of the mount target to delete (String).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteMountTargetRequest withMountTargetId(String mountTargetId) {
        setMountTargetId(mountTargetId);
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
        if (getMountTargetId() != null)
            sb.append("MountTargetId: ").append(getMountTargetId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteMountTargetRequest == false)
            return false;
        DeleteMountTargetRequest other = (DeleteMountTargetRequest) obj;
        if (other.getMountTargetId() == null ^ this.getMountTargetId() == null)
            return false;
        if (other.getMountTargetId() != null && other.getMountTargetId().equals(this.getMountTargetId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMountTargetId() == null) ? 0 : getMountTargetId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteMountTargetRequest clone() {
        return (DeleteMountTargetRequest) super.clone();
    }

}
