#include <stdio.h>
#include <math.h>

float sphere_volume(float radius) {
float volume;
volume = (4/3) * M_PI * radius * radius * radius;
return volume;
}

int main() {
float r;
printf("Enter the radius:");
scanf("%f", &r);
printf("Volume of the sphere: %f\n", sphere_volume(r));
return 0;
}
