package com.projectJJ.config;

import java.io.ByteArrayInputStream;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;

import org.springframework.boot.context.properties.ConfigurationPropertiesBinding;
import org.springframework.core.convert.converter.Converter;
import org.springframework.security.converter.RsaKeyConverters;
import org.springframework.stereotype.Component;

//@Component
//@ConfigurationPropertiesBinding
public class PrivateKeyConverter implements Converter<String,RSAPrivateKey> {

    @Override
    public RSAPrivateKey convert(String from) {
        return RsaKeyConverters.pkcs8().convert(new ByteArrayInputStream(from.getBytes()));
    }

}
