public class Main {
    public static void main(String[] args) {
        int threshold = 1000; //если клиент пополняет счёт более чем на 1000р
        int accountsRefill; // пополнение счёта
        accountsRefill = 1050; // пополнение счёта на 1050р
        int currentBalance; // текущий баланс
        currentBalance = 100;// текущий баланс 100р

        int bonus; // бонус
        if(accountsRefill > threshold) { // пополнение счёта больше чем на 1000р
            bonus = accountsRefill / 100; // пополняемая сумма делится на 100
        } else {
            bonus = 0; // если пополняемая сумма не делится на 100, бонус не начисляется
        }

        int totalBalance; // общий баланс клиента
        totalBalance = currentBalance + accountsRefill * 100 + bonus * 100; // общий баланс = текущий баланс + пополнение счета * 100 + бонус * 100

        System.out.println(totalBalance); // итоговый баланс
        System.out.println(bonus); // начисленный бонус
    }
}