package alpacaive.projectboard.repository;

import alpacaive.projectboard.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

@RepositoryRestResource
public interface ArticleRepository extends JpaRepository<Article, Long> {
}