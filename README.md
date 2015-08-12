# SimpleAlexaJavaLambda
This is just a simple java lambda that I got working with alexa.

##What this lambda does

All it does is return a fully canned response to all alexa requests

##Using this example

Run ```mvn package``` to generate the jar and then simply upload the jar as using the upload zip file option in AWS lambdas.

The configuration for the handler is :

```com.alexaExamples.AlexaExampleLambda::myHandler```

Now just configure alexa to talk to this lambda using the instructions here :

https://developer.amazon.com/public/solutions/alexa/alexa-skills-kit/docs/developing-an-alexa-skill-as-a-lambda-function

##About this example
I mostly did this because I could not find a good full example project that would work with alexa in lambdas because lambdas are so much easier than setting up the servlet.

The extra data classes listed here are actually just for formatting the response into the proper json that alexa expects. I want to create parallels for the request as well.

Those classes were generated using lombok but I couldn't get lombok to compile properly so I just delomboked them. I'll get around to that at some point.

Those classes were also just copied mostly from the alexa skills toolkit but the toolkit has so many extra dependencies and is not a maven package yet so this was simpler.
