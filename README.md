## Fortune Teller App
### Authors: Lila Kim & Enzo Belluomini

This app allows the user to get a random fortune from a set list of fortunes. They can also choose to add or remove fortune from the list. The fortunes are stored in an ArrayList. The program uses a separate class for the logic and another for the interface.

The FortuneTeller class handles all the fortune data (adding, removing, and picking a random fortune). The App class creates the window and UI and lets the user interact with the program.

## Folder Structure
- │
- ├── src/
- │   ├── App.java
- │   ├── FortuneTeller.java
- │
- ├── README.md


## Features
- Generate a random fortune
- Add a fortune
- Remove a fortune
- Show the list of all available fortunes
The program also uses exception handling so it doesn’t crash if you leave the input box empty and shows an error message instead.

<img width="608" height="593" alt="Screenshot 2026-05-15 at 8 16 31 PM" src="https://github.com/user-attachments/assets/dd22cfb2-467e-4bb2-809b-92b6935319cb" />
The user types a fortune they want to add and then clicks "Add Fortune". They can do the same to remove a fortune by typing the fortune they want to remove and clicking "Remove Fortune". They can generate a random fortune from the list by clicking "Random Fortune" or view the full list of fortunes by clicking "View All"

<img width="275" height="440" alt="image" src="https://github.com/user-attachments/assets/325d4be1-3bb2-48c4-8732-07eb5f2bbe09" />
