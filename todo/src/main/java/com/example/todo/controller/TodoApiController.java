package com.example.todo.controller;

import com.example.todo.domain.Todo;
import com.example.todo.service.TodoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/todos")
@RequiredArgsConstructor
@Tag(name = "todos", description = "할일 정보를 보여주는 api 입니다^^")
public class TodoApiController {

  private final TodoService todoService;

  @Operation(
    summary = "get todos",
    description = "모든 할일 목록을 가져옵니다."
  )
  @GetMapping
  public List<Todo> getTodos() {
    return todoService.getTodos();
  }

  @Parameters(
    { @Parameter(name = "id", description = "Todo id", example = "1") }
  )
  @GetMapping("/{id}")
  public Todo getTodo(@PathVariable("id") Long id) {
    return todoService.getTodo(id);
  }

  @ApiResponses(
    {
      @ApiResponse(responseCode = "200", description = "성공"),
      @ApiResponse(
        responseCode = "400",
        description = "요청을 잘 확인해보세요."
      ),
      @ApiResponse(responseCode = "403", description = "권한을 확인해보세요."),
    }
  )
  @PostMapping
  public Todo addTodo(@RequestBody Todo todo) {
    System.out.println(todo);
    return todoService.addTodo(todo.getTodo());
  }

  @PatchMapping
  public Todo updateTodo(@RequestBody Todo todo) {
    System.out.println(todo);
    return todoService.updateTodo(todo.getId());
  }

  @DeleteMapping("/{id}")
  public String deleteTodo(@PathVariable("id") Long id) {
    todoService.deleteTodo(id);
    return "ok!!";
  }
}
