## Strategy

is a behavioral design pattern that lets you define a family of algorithms, put each of them into a separate class, and
make their objects interchangeable.

The Strategy pattern suggests that you take a class that does something specific in a lot of different ways and extract
all of these algorithms into separate classes called strategies.
The Strategy interface is common to all concrete strategies. It declares a method the context uses to execute a
strategy.

Concrete Strategies implement different variations of an algorithm the context uses.

the original class called context, and it maintains a reference to one of the concrete strategies and communicates with
this object only via the strategy interface.
The context isn't responsible for selecting an appropriate algorithm for the job. It delegates the work to a linked
strategy object instead of executing it on its own

### Examples

you're developing an e-commerce platform where different products may have varying pricing logic based on factors such
as customer segment. We have regular, gold and premium membership. Once product price is calculated, then at the
checkout the customer could pay with different methods like PayPal, VisaCard and BankTransfer. Each payment method vary
in it’s logic of processing the payment and conducting required fees.

--------------------

You're developing a notification service that should support three different types of notifications to users, e.g., SMS,
email, Messenger, and Slack notifications.

--------------------

Please build a message formatter that supports 3 different types of message formatting, e.g., JSON message formatter,
XML message formatter, and plain text message formatter.

That message formatter should have the ability to format messages and provide functionality that identifies and
retrieves their type, whether it's: XML , JSON , PLAIN_TEXT

### Applicability

- when you want to use different variants of an algorithm within an object and be able to switch from one algorithm to
  another during runtime.
- when you have a lot of similar classes that only differ in the way they execute some behavior.
- when your class has a massive conditional statement that switches between different variants of the same algorithm.

