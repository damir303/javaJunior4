package lesson16;

import org.apache.log4j.Logger;

public class Main {
    public static final Logger LOGGER = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        LOGGER.trace("���� ��������� trace");
        LOGGER.debug("���� ��������� debug");
        LOGGER.warn("���� ��������� warn" );
        LOGGER.info("���� ��������� info");
        LOGGER.error("���� ��������� error");
        LOGGER.fatal("���� ��������� fatal");
    }
}
