package Unit6.ReturnObject;
// Возврат объекта, определяемого разработчиком
public class Err {
    String msg; // сообщение об ошибке
    int severity; // уровень серьезности ошибки

    Err(String m ,int s) {
        msg = m;
        severity = s;
    }
}

class ErrorInfo {
    String[] msgs = {
            "Ошибка вывода",
            "Ошибка ввода",
            "Отсутствует место на диске",
            "Выход индекса за пределы массива"
    };
    int[] howBad = {3, 3, 2, 4};

    Err getErrorInfo(int i) { // Возврат обхекта типа Err
        if (i >= 0 & i < msgs.length) {
            return new Err(msgs[i], howBad[i]);
        } else {
            return new Err("Несуществующий код ошибки", 0);
        }
    }
}

class ErrInfo {
    public static void main(String[] args) {
        ErrorInfo err = new ErrorInfo();
        Err e;

        e = err.getErrorInfo(2);
        System.out.println(e.msg + " уровень: " + e.severity);

        e = err.getErrorInfo(19);
        System.out.println(e.msg + " уровень: " + e.severity);
    }
}
