# Rural-Bank-Assignment

Class design: 

BankAccount: Abstract Parent Class: 

--> Contains basic attributes like `accountNumber`, `balance`, and `ownerName`.

--> Provides methods for depositing, withdrawing, and displaying account details where withdraw method is abstract meaning it should be inherited by all. 

SavingsClass: Child class: 
  --> It contains method for adding interest Functionality.
  
  --> Inherit properties from parent class
  
  --> Contains method for deposit and withdraw.

  CurrentAccount class: 
  --> It handles overdraft limit. 
  
  ---> Inherit from parent class.
  
  --> Also contains method for deposit and withdraw. 

  Customer class 
 --> It allows users to create multiple accounts 
 
 --> Demonstrating aggregation — where a customer "has-a" relationship with multiple accounts.

 #OOP implementation:

 -Bank account is abstract meaning abstraction principle is followed i.e. hiding all the internal details.
 
 -Saving account and current account extends from bankaccount meaning inheritance concept is applied.
 
- All the sensative attributes like balance are kept private  and its accessed by getters and setters meaning encapusulation principle is applied.
  
-Run time polymorphism is applied by overriding withdraw methods creating in parent class where its functionality are added according to the requirment.

 -Customer "has" one or more BankAccount objects — representing a real-world relationship which shows the principle of aggregation.
 
 -InsufficientBalanceException is used to handle overdraft limit  and low balance in account gracefully.

   
 
 
 
 

  
