/*
 * The contents of this file are subject to the terms of the Common Development and
 * Distribution License (the License). You may not use this file except in compliance with the
 * License.
 *
 * You can obtain a copy of the License at legal/CDDLv1.0.txt. See the License for the
 * specific language governing permission and limitations under the License.
 *
 * When distributing Covered Software, include this CDDL Header Notice in each file and include
 * the License file at legal/CDDLv1.0.txt. If applicable, add the following below the CDDL
 * Header, with the fields enclosed by brackets [] replaced by your own identifying
 * information: "Portions copyright [year] [name of copyright owner]".
 *
 * Copyright 2011-2017 ForgeRock AS. All Rights Reserved
 */
/**
 * Portions Copyright 2018 NoPassword Inc.
 */
package com.nopassword.openam.workstation.model;

/**
 *
 * @author NoPassword
 */
public class CheckTokenRequest {

    private String apiKey;
    private String token;

    public CheckTokenRequest() {
    }

    public CheckTokenRequest(String apiKey, String token) {
        this.apiKey = apiKey;
        this.token = token;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return "CheckTokenRequest{" + "apiKey=" + apiKey + ", token=" + token + '}';
    }

}
