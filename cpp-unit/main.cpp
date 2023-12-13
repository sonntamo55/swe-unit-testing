#include <iostream>

using namespace std;

class Person {
    public:
        string name;
        string street;
        string city;
        string country;

    Person() {
        country = "default";
    }
};

class Address {
    public:
        Person addressStringToObject(string addrStr) {
            Person person;
            string del = ",";
            int anz = 0;
            int end = addrStr.find(del); 
            while (end != -1) { // Loop until no delimiter is left in the string.
                switch (anz) {
                    case 0: person.name = addrStr.substr(0, end); break;
                    case 1: person.street = addrStr.substr(0, end); break;
                    case 2: person.city = addrStr.substr(0, end); break;
                    case 3: person.country = addrStr.substr(0, end); break;
                }
                cout << end << "\n";
                anz++;
                addrStr.erase(addrStr.begin(), addrStr.begin() + end + 1);
                end = addrStr.find(del);
            }
            return person;
        }

};

int main() {
    cout << "Hello World!\n";
    Address addr;
    Person res = addr.addressStringToObject("Mirko Sonntag,Flandernstr 101,73732 Esslingen,");
    cout << res.name + "\n";
    cout << res.street + "\n";
    cout << res.city + "\n";
    cout << res.country + "\n";
    return 0;
}




