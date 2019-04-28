package school.project.securitybracelet.core.service;

import org.apache.commons.codec.digest.DigestUtils;

public class HashService {


    /**
     * Function to generate password MD5 hash string
     *
     * @param password - user password
     * @return new MD5 hash string
     */
    public String generateHash(final String password) {
        return DigestUtils.md5Hex(password).toUpperCase();
    }

    /**
     *
     * @param originPass
     * @param password
     * @return
     */
    public boolean match(String originPass, String password) {
        return originPass.equals(generateHash(password));
    }
}