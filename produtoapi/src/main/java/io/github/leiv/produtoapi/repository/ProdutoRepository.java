package io.github.leiv.produtoapi.repository;

import io.github.leiv.produtoapi.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, String> {
}
