# MOOC.fi-Answers
# Java MOOC Answers
### What is this course?
University of Helsinki MOOC Java Programming 1 and 2 are a couple of the most highly recommended entry points on your path to learning java. The course is free and easy to access. You can find the free courses at MOOC.fi


### What is this repository?
These are my own answers to all the exercises in the Java MOOC.fi course. These are only meant to guide you towards finding your own answers. Try not to directly copy my code if you're insterested in learning yourself. I will ensure all code is commented and my thought process/algorithms are detailed wherever necessary. 


### TMCBeans wont open on my mac. The icon just bounces.

Open a Terminal and type -

/usr/libexec/java_home -v '1.7*'

Copy the path to your clipboard. If you do not have Java installed, do that first. I recommend https://adoptopenjdk.net/. Java 11 is fine for this course.

Right click(two-finger press on MacBook) on TMCBeans icon. Select "Show in finder".

Right click on TMCBeans in the Finder. click "Show package contents".

Navigate to contents/Resources/tmcbeans/etc

Open the file tmcbeans.conf in a text editor.

Near the bottom of the file you'll find a line - #jdkhome="path to java"

Copy the java path in your terminal and paste it in place of "path to java". Then get rid of the hashtag. It should look something like:

jdkhome="/Library/Java/JavaVirtualMachines/adoptopenjdk-11.jdk/Contents/Home"

Save the file. 

TMCBeans will now open.

# MOOC.fi-Answers
