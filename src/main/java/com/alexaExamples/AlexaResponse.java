package com.alexaExamples;

import java.util.Map;

/**
 * The full response object.
 */
public class AlexaResponse {
    public String version;
    public Map<String, Object> sessionAttributes;
    public AlexaUiResponse response;

    @java.beans.ConstructorProperties({"version", "sessionAttributes", "response"})
    public AlexaResponse(String version, Map<String, Object> sessionAttributes, AlexaUiResponse response) {
        this.version = version;
        this.sessionAttributes = sessionAttributes;
        this.response = response;
    }

    public AlexaResponse() {
    }

    public String getVersion() {
        return this.version;
    }

    public Map<String, Object> getSessionAttributes() {
        return this.sessionAttributes;
    }

    public AlexaUiResponse getResponse() {
        return this.response;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public void setSessionAttributes(Map<String, Object> sessionAttributes) {
        this.sessionAttributes = sessionAttributes;
    }

    public void setResponse(AlexaUiResponse response) {
        this.response = response;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof AlexaResponse)) return false;
        final AlexaResponse other = (AlexaResponse) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$version = this.version;
        final Object other$version = other.version;
        if (this$version == null ? other$version != null : !this$version.equals(other$version)) return false;
        final Object this$sessionAttributes = this.sessionAttributes;
        final Object other$sessionAttributes = other.sessionAttributes;
        if (this$sessionAttributes == null ? other$sessionAttributes != null : !this$sessionAttributes.equals(other$sessionAttributes))
            return false;
        final Object this$response = this.response;
        final Object other$response = other.response;
        if (this$response == null ? other$response != null : !this$response.equals(other$response)) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $version = this.version;
        result = result * PRIME + ($version == null ? 0 : $version.hashCode());
        final Object $sessionAttributes = this.sessionAttributes;
        result = result * PRIME + ($sessionAttributes == null ? 0 : $sessionAttributes.hashCode());
        final Object $response = this.response;
        result = result * PRIME + ($response == null ? 0 : $response.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof AlexaResponse;
    }

    public String toString() {
        return "com.magic.pricelookup.AlexaResponse(version=" + this.version + ", sessionAttributes=" + this.sessionAttributes + ", response=" + this.response + ")";
    }
}
