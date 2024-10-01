#include <iostream>
#include <cmath> 

double calculateVolume(double radius) {
    return (4.0 / 3.0) * M_PI * pow(radius, 3);
}

int main() {
    double radius;

    std::cout << "Enter the radius of the sphere: ";
    std::cin >> radius;

    if (radius < 0) {
        std::cout << "Radius cannot be negative." << std::endl;
        return 1;
    }

    double volume = calculateVolume(radius);

    std::cout << "The volume of the sphere is: " << volume << std::endl;

    return 0;
}
