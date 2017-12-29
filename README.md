# Deck-of-cards

 Complete deck of cards providing the two operations :

  - shuffle() :
  shuffle returns no value, but results in the cards in the deck being randomly permuted
  
  - dealOneCard() :
  returns one card from the deck to the caller. Specifically, a call to shuffle()  followed by 52 calls to  dealOneCard()  should result in the caller being provided all 52 cards of the deck in a random order. If the caller then makes a 53rd call dealOneCard(),  no card is dealt.
