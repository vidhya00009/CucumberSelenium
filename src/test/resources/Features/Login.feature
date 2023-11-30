Feature: BuyBooks
Scenario Outline: Launching BuyBooks

### SearchBox ###
Given Enter the Url
When Search the "<Books>"
Then Select Book


### BestSeller ###
When Click BestSeller


### NewArrival ###
When Click NewArrival


### PreOrder ###
When Click the Preorder

And select a book
Then addcart and buynow and add quantity

### Module1-Children and Adault ###
When select Action Books

And Select Zombie Book
Then Addcart and Buynow

### Module1-Craft ###
When Click Craft

And Select any book
Then Add to cart and Buy

### Module2-Fiction and Nonfiction-Travels ###
When Select Travel Books

And Select TourismBooks
Then click Addcart and buy

### Module2-MemoirBooks ###
When Click a Memoir Books

Then AddCart and BuyNow

### Module3-School-SubjectWise ###
When click Subject
And Select English Books

And Select  Aiming  of Progress Books
Then AddtoCart and Buy

### Module3-BoardWise ###
When Click Boardwise Books
And Select State Boaard

Then Select Central Book

### Module4-TestPrepare-Interview Preparation ###
When Select Interview Prepare Books

And Select CommunicationSkills
Then Add To Cart and Buy Now

### Module5-Games-Puzzles ###
When Click Puzzles

And Select Aladdin Books
Then Click Add to Cart and Buy
Examples:
|Books     |
|StoryBooks|