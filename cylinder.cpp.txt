#include<iostream>
using namespace std;

class Cylinder {
    public:
    double radius, height;

    // Method to calculate the surface area
    double surfacearea(double radius,double height) {
        return (2 * 3.142 * radius * radius) + (2 * 3.142 * radius * height);
    }

    // Method to calculate the volume
    double volume(double radius,double height) {
        return (3.142 * radius * radius * height);
    }
};

int main() {
    Cylinder cyl;
    double r, h;

    cout << "Enter the radius and height of the cylinder: " << endl;
    cin >> r >> h;

   cyl.radius = r;
   cyl.height = h;

   cout << "Surface area: " << cyl.surfacearea(r, h) << endl;

   cout << "Volume: " << cyl.volume(r, h) << endl;
    return 0;
}