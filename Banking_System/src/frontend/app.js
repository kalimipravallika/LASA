class OrderProcessor {

    constructor(customer, amount) {
        this.customer = customer;
        this.amount = amount;
    }

    calculateTax() {
        return this.amount * 0.18;
    }

    calculateTotal() {
        return this.amount + this.calculateTax();
    }

    printReceipt() {

        console.log("=======================");
        console.log("ORDER RECEIPT");
        console.log("=======================");

        console.log("Customer :", this.customer);
        console.log("Amount   :", this.amount);
        console.log("Tax      :", this.calculateTax());
        console.log("Total    :", this.calculateTotal());

        console.log("=======================");
    }
}

function main() {

    const processor = new OrderProcessor("John", 1000);

    processor.printReceipt();
}

main();
