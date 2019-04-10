package com.herewellstay.text;

public class EndsWithFilter implements Filter {
    private String[] endings;

    public EndsWithFilter(String[] endings) {

        this.endings = endings;
    }

    @Override
    public boolean accepts(String string) {
        for (String ending : endings) {
            if (string.endsWith(ending)) {
                return true;
            }
        }
        return false;
    }
}
