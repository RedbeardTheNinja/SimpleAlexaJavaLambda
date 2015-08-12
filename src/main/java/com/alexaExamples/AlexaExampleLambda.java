package com.alexaExamples;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/**
 * This is a very simple class that can handle alexa requests.
 */
public class AlexaExampleLambda {
    //TODO I should actually map out an alexa request at some point or figure out a way to get it from the alexa toolkit
    public AlexaResponse myHandler(Map<String, Object> request, Context context) throws IOException {
        LambdaLogger logger = context.getLogger();
        logger.log("received request : " + request);
        AlexaUiResponse alexaUiResponse = new AlexaUiResponse();
        //oh god what have I done
//        Map<String, Object> theRequest = (Map<String, Object>) request.get("request");
//        Map<String, Object> intent = (Map<String, Object>) theRequest.get("intent");
//        Map<String, Object> slots = (Map<String, Object>) intent.get("slots");
//        logger.log("\n\nslots : " + slots.toString());
//        for (Map.Entry<String, Object> obj : slots.entrySet()) {
//            logger.log("\nObject key : " + obj.getKey());
//            logger.log("\nObject type : " + obj.getValue().getClass());
//            logger.log("\nObject value : " + obj.toString());
//        }
        alexaUiResponse.setOutputSpeech(new OutputSpeech("PlainText", "Welcome to this alexa example"));
        alexaUiResponse.setCard(new Card("Simple", "Price Lookup", "The price of a card"));
        alexaUiResponse.setReprompt(new Reprompt(new OutputSpeech("PlainText", "re-prompt")));
        return new AlexaResponse("1.0", Collections.singletonMap("favoriteColor", (Object) "blue"), alexaUiResponse);
    }
}
