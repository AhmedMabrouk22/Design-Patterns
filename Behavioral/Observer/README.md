## Observer (Event-Subscriber, Listener)

is a behavioral design pattern that lets you define a subscription mechanism to notify multiple objects about any events
that happen to the object they're observing

### Example

We want to create a Marketplace Notification system where users can subscribe to notifications for new product arrivals
or new offers in an online marketplace. Whenever a new product or new offer is added to the marketplace, subscribed
users should receive notifications.

---

### Applicability

- Use the Observer pattern when changes to the state of one object may require changing other objects, and the actual
  set of objects is unknown beforehand or changes dynamically.
- Use the pattern when some objects in your app must observe others, but only for a limited time or in specific cases.
