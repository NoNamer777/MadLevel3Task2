## MAD - Level 3: Task 2

This Mobile Application is developed as part of the introduction to the Mobile Application Development at HvA.
The application is used as an introduction to using fragments for multi view applications.

This app should be used to manage all the websites that a student at the HvA would need
in order to find information about his courses, what his schedule is and all the other
things that are important for his study.

The app exists out of two fragments, one to view the websites, the other to add them.

## level 3 questions

-	Which stages of an activity lifecycle exists?  
An activity has 6 lifecycle stages. Namely: create, start, resume, pause, stop, and destroy.

-	Which are the two kind of intents, and what is the difference?  
There are two kinds of intents: implicit and explicit intents. The difference between them is that with an implicit intent, no target component is provided, so the Android OS needs to figure out, or ask the user how to react to the intent. With explicit intents a component is provided, thus the Intent can only be fulfilled by that component alone.

-	What is the difference between Parcelables and Serializables?  
Parcelable and Serializable are both interfaces that are used to pass data between Activities.
The difference between them is that Serializable will create a lot of temporary objects and also causes a quite a bit of garbage collecting to do, thus slowing the application down. Parcelable does not do this, but on the other hand is a bit harder to implement. The reason that Parcelable is faster then a Serializable is because a Parcelable is being explicit about the Serialization process and the code has been optimized more than the first.

-	What is the purpose of the Analyzer?  
The purpose of the Analyzer is to manually run inspections on different sort of scopes within your project.

