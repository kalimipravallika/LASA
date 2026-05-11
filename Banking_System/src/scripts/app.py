import datetime


class PaymentProcessor:

    def __init__(self, customer_name, amount):
        self.customer_name = customer_name
        self.amount = amount

    def calculate_tax(self):
        return self.amount * 0.18

    def calculate_total(self):
        return self.amount + self.calculate_tax()

    def generate_receipt(self):

        print("================================")
        print("PAYMENT RECEIPT")
        print("================================")
        print(f"Customer : {self.customer_name}")
        print(f"Amount   : {self.amount}")
        print(f"Tax      : {self.calculate_tax()}")
        print(f"Total    : {self.calculate_total()}")
        print(f"Date     : {datetime.datetime.now()}")
        print("================================")


def main():

    processor = PaymentProcessor("John", 1000)

    processor.generate_receipt()


if __name__ == "__main__":
    main()
