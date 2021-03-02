package br.com.realizecfi.reciclagem.web;

import org.springframework.http.ResponseEntity;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api(tags = "Api") // FIXME
interface ReciclagemApi {

    @ApiOperation(value = "", // FIXME
            notes = "") // FIXME
    @ApiResponses({
            @ApiResponse(code = 200, message = ""), // FIXME
            @ApiResponse(code = 400, message = ""), // FIXME
            @ApiResponse(code = 500, message = "") // FIXME
    })
    ResponseEntity<HelloWorld> helloWorld(
            @ApiParam(value = "", required = true) String parametro); // FIXME
}
