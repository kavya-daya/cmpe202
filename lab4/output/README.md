**Lab 4 - Din Tai Fung Design Pattern**
<br><br>
Im using two design patterns for this lab.

**Chain of Responsibility** : The Restaurant class will send the responsibility of assigning the table to the Restaurant Manager which processes it and in turn hands over the responsibility to Table Manager<br>
**Observer Pattern** : The Table Manager class notifies its observers’ Restaurant and Restaurant manager about the availability of the table.

<br><br><br>
**CRC DIAGRAMS**

---------------------------------------------------------------------
**Customer**

**Responsibilities** 

Knows name, cell phone number, number of people in the party <br>
Sign up on a waitlist <br>
Responds CONFIRM/LEAVE to the "table ready" notification<br>

**Collaborators**

Restaurant

---------------------------------------------------------------------

**Restaurant**

**Responsibilities** 

Has Customer number, party size <br>
Knows about the customer queue <br>
dds customer to the queue Notifies customer about the waitlist <br>
Updates Customers' response to Restaurant Manager<br>

**Collaborators**

Customer<br>
Restaurant Manager<br>
Table Manager<br>

---------------------------------------------------------------------

**Restaurant Manager**

**Responsibilities** 
Has Customer number, party size <br>
Sends the table manager a new table request <br>
Gets the table ready notification from the table manager <br>
Gets Customers' response from Restaurant <br>
Notifies the table manager about table being assigned/not assigned based on customers' response <br>
Updates customer queue<br>

**Collaborators**

Restaurant <br>
Table Manager<br>

---------------------------------------------------------------------

**Table Manager**

**Responsibilities** 

Knows party size <br>
Notifies the Restaurant about the table availability <br>
Notifies the Restaurant <br>
Manager about the table availability Updates the table list<br>

**Collaborators**

Restaurant <br>
Restaurant Manager<br>
