package ch7_oop2;

interface Parseable {
    // 구문 분석작업을 수행한다.
    public abstract void parse(String fileName);
}

class ParserManager {
    // 리턴타입이 Parseable인터페이스이다. 리턴타입이 인터페이스라는 것은 해당 인터페이스를 구현한 클래스의 인스턴스를 반환.
    public static Parseable getParser(String type) {
        if(type.equals("XML")) {
            return new XMLParser();   // Parseable인터페이스를 구현한 XMLParser클래스의 인스턴스를 반환.
        }else {
            Parseable p = new HTMLParser();
            return p;                 // Parseable인터페이스를 구현한 HTMLParser클래스의 인스턴스를 반환.
            // 위 두 줄을 return new HTMLParser();로 줄일 수 있다.
        }
    }
}

class XMLParser implements Parseable {
    @Override
    public void parse(String fileName) {    // Parseable인터페이스의 parse(String fileName)을 구현.
        /* 구문 분석작업을 수행하는 코드를 적는다. */
        System.out.println(fileName + "- XML parsing completed.");
    }
}

class HTMLParser implements Parseable {
    @Override
    public void parse(String fileName) {  // Parseable인터페이스의 parse(String fileName)을 구현.
        /* 구분 분석작업을 수행하는 코드를 적는다. */
        System.out.println(fileName + "-HTML parsing completed.");
    }
}

public class ParserTest {
    public static void main(String[] args) {
        Parseable parser = ParserManager.getParser("XML");
        //getParser("XML")의 결과로 참조변수 parser는 XMLParser인스턴스의 주소값을 갖는다.
        //마치 'Parseable parser = new XMLParser();이 수행된 것과 같다.

        parser.parse("document.xml");
        //parser는 XMLParser인스턴스를 가리킨다. XMLParser인스턴스의 parse메서드가 호출된다.

        parser = ParserManager.getParser("HTML");
        parser.parse("document2.html");
    }
}

// 만일 나중에 새로운 종류의 XML구문분석기 NEWXMLParser클래스가 나와도 ParserTest클래스는 변경할 필요 없이 ParserManager클래스의 getParser메서드에서
//'return new XMLParser();' 대신 'return new NEWXMLParser();'로 변경하기만 하면 된다.
