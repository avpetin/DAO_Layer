package ru.netology.dao_layer.repository;

import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Repository
public class DAORepository {
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
    private final String scriptFileName = "select_script.sql";

    private String script = read(scriptFileName);
    public List<String> getProductName(String name) {
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("name", name);
        return namedParameterJdbcTemplate.queryForList(script, paramMap, String.class);
    }

    private static String read(String scriptFileName) {
        try (InputStream is = new ClassPathResource(scriptFileName).getInputStream();
             BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(is))) {
            return bufferedReader.lines().collect(Collectors.joining("\n"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
