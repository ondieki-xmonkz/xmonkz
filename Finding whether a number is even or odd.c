#include <stdio.h>

int is_even(int num) {
    if (num % 2 == 0) {
        return 1; // Number is even
    } else {
        return 0; // Number is odd
    }
}

int main() {
    int number;
    printf("Enter a number: ");
    scanf("%d", &number);

    if (is_even(number)) {
        printf("%d is an even number.\n", number);
    } else {
        printf("%d is an odd number.\n", number);
    }

    return 0;
}
