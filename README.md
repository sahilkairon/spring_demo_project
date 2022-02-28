# spring_demo_project
Spring is used for dependency injection and helps in making enterprise level application building process easy. 
With the use of Spring we can get object of specific class by declaring its bean in .xml file and writting property for member variable. 
This was we can get this object any where just by makking a call to the bean factory. 
Spring follows singelton behaviour by default and all the objects are initiated at the process of initialization of bean itself. However if we want to change this behavior it can be done by declaring the bean scope to prototype. 

Use of Spring: - 
Suppose we want to make 100 objects of a class in 100 different classes. Then instead of importing that class or package in which that class is present and making its object using new keyword, we can declare the bean of that class object and wherever we need that class object we can call that bean and spring will provide us with the object. 

About the project code: - 
This is a spring demo project that includes how application context is used to get the beans from the bean factory and how to use different annotations like autowired and components . And how to use messagesource fuctionality of Spring to get the messages from the properties file in Spring with the help of getMessage() method and use of Key. 
