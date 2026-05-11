#include <stdio.h>
#include <string.h>

float calculateTax(float amount) {
    return amount * 0.18;
}

float calculateTotal(float amount) {
    return amount + calculateTax(amount);
}

void printReceipt(char customer[], float amount) {

    printf("==============================\n");
    printf("PAYMENT RECEIPT\n");
    printf("==============================\n");

    printf("Customer : %s\n", customer);
    printf("Amount   : %.2f\n", amount);
    printf("Tax      : %.2f\n", calculateTax(amount));
    printf("Total    : %.2f\n", calculateTotal(amount));

    printf("==============================\n");
}

int main() {

    char customer[50] = "John";

    float amount = 1000;

    printReceipt(customer, amount);

    return 0;
}
