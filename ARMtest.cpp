// ARMtest.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include <iostream>
using namespace std; 


// Iain stinks a lot
void panagram() {


    string alphabet = " abcdefghijklmnopqrstuvwxyz";
    string userInput; 
    char userSentence[1000];



    cout << "Type a sentence, i'll test if it's a pangram: ";
//    cin >> userInput; 

    
 //   userInput.erase(' '); 
 //   userInput.erase(std::remove_if(userInput.begin(), userInput.end(), ::isspace), userInput.end());

    cout << userInput; 

    cin.getline(userSentence, sizeof(userSentence)); // Get user input

    cout << userSentence << "\n";
    int length = strlen(userSentence);
    int count = 0;

    


    cout << length << "\n";

    for (int i = 0; i < length; i++) {

        if (alphabet.find(userSentence[i])) {

            char  Exception = userSentence[i];
            cout << "Exception is : " << Exception << endl;
            int Expos = alphabet.find(Exception);
            cout << "Exception found at position : " << Expos << endl;

            
            alphabet.erase(Expos, 1);
            
           

            cout << alphabet << endl;


            count = count + 1;
            cout << "Count is :" << count << "\n";

        }

        else {
            cout << "Not found :(";
        }
            

        

        


    }
    if (count >= 26) {
        cout << "Your string is a Pangram - " << "Count is" << count << endl;
    }


}




int main()
{
    std::cout << "Hello World!\n";


    panagram(); 











}





//hi test