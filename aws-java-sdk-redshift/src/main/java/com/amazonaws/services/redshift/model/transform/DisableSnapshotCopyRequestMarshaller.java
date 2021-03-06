/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.redshift.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.redshift.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;

/**
 * DisableSnapshotCopyRequest Marshaller
 */

public class DisableSnapshotCopyRequestMarshaller implements Marshaller<Request<DisableSnapshotCopyRequest>, DisableSnapshotCopyRequest> {

    public Request<DisableSnapshotCopyRequest> marshall(DisableSnapshotCopyRequest disableSnapshotCopyRequest) {

        if (disableSnapshotCopyRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DisableSnapshotCopyRequest> request = new DefaultRequest<DisableSnapshotCopyRequest>(disableSnapshotCopyRequest, "AmazonRedshift");
        request.addParameter("Action", "DisableSnapshotCopy");
        request.addParameter("Version", "2012-12-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (disableSnapshotCopyRequest.getClusterIdentifier() != null) {
            request.addParameter("ClusterIdentifier", StringUtils.fromString(disableSnapshotCopyRequest.getClusterIdentifier()));
        }

        return request;
    }

}
