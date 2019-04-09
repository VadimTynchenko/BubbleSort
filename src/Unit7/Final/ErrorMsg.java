package Unit7.Final;

// Возврат объекта типа String
public class ErrorMsg {
    // Коды ошибок.
    // Константы объявляются с помощью ключевого слова final
    final int OUTERR = 0;
    final int INERR = 1;
    final int DISKERR= 2;
    final int INDEXERR = 3;

    String[] msg = {
            "Ошибка вывода",
            "Ошибка ввода",
            "Отсутствует место на диске",
            "Выход индекса за пределы массива"
    };

    // Возвратить сообщение об ошибке
    String getMsg(int i) {
        if (i >= 0 & i < msg.length) {
            return msg[i];
        } else return "Несуществующий код ошибки";
    }
}

class FinalD {
    public static void main(String[] args) {
        ErrorMsg errorMsg = new ErrorMsg();

        // При вызове метода используются ключевые константы,
        // объявленные с помощью ключевого слова fina
        System.out.println(errorMsg.getMsg(errorMsg.INDEXERR));
        System.out.println(errorMsg.getMsg(errorMsg.INERR));
    }
}
