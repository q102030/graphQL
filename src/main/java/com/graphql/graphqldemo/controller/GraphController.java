package com.graphql.graphqldemo.controller;

import com.alibaba.fastjson.JSONException;
import com.graphql.graphqldemo.service.GraphQLService;
import graphql.ExecutionResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import java.io.IOException;
import java.util.Map;

@RestController
public class GraphController {

    @Autowired
    GraphQLService graphQLService;

    @RequestMapping(value="/getData")
    public String getGraphDate(@RequestBody String query) throws JSONException, IOException{
        ExecutionResult executionResult = graphQLService.initiateGraphQL().execute(query);
        Map<String, Object> map = executionResult.getData();
        JSONObject jsonObject = new JSONObject(map);
        return  jsonObject.toString();
    }
}
