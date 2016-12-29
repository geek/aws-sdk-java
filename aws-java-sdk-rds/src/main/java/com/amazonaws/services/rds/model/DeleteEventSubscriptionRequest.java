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
package com.amazonaws.services.rds.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DeleteEventSubscription"/>AWS API
 *      Documentation</a>
 */
public class DeleteEventSubscriptionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the RDS event notification subscription you want to delete.
     * </p>
     */
    private String subscriptionName;

    /**
     * <p>
     * The name of the RDS event notification subscription you want to delete.
     * </p>
     * 
     * @param subscriptionName
     *        The name of the RDS event notification subscription you want to delete.
     */

    public void setSubscriptionName(String subscriptionName) {
        this.subscriptionName = subscriptionName;
    }

    /**
     * <p>
     * The name of the RDS event notification subscription you want to delete.
     * </p>
     * 
     * @return The name of the RDS event notification subscription you want to delete.
     */

    public String getSubscriptionName() {
        return this.subscriptionName;
    }

    /**
     * <p>
     * The name of the RDS event notification subscription you want to delete.
     * </p>
     * 
     * @param subscriptionName
     *        The name of the RDS event notification subscription you want to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteEventSubscriptionRequest withSubscriptionName(String subscriptionName) {
        setSubscriptionName(subscriptionName);
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
        if (getSubscriptionName() != null)
            sb.append("SubscriptionName: ").append(getSubscriptionName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteEventSubscriptionRequest == false)
            return false;
        DeleteEventSubscriptionRequest other = (DeleteEventSubscriptionRequest) obj;
        if (other.getSubscriptionName() == null ^ this.getSubscriptionName() == null)
            return false;
        if (other.getSubscriptionName() != null && other.getSubscriptionName().equals(this.getSubscriptionName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSubscriptionName() == null) ? 0 : getSubscriptionName().hashCode());
        return hashCode;
    }

    @Override
    public DeleteEventSubscriptionRequest clone() {
        return (DeleteEventSubscriptionRequest) super.clone();
    }

}
