package alpacaive.projectboard.dto.request;

import alpacaive.projectboard.dto.ArticleCommentDto;
import alpacaive.projectboard.dto.UserAccountDto;

/**
 * DTO for {@link alpacaive.projectboard.domain.ArticleComment}
 */
public record ArticleCommentRequest(Long articleId, String content) {

    public static ArticleCommentRequest of(Long articleId, String content) {
        return new ArticleCommentRequest(articleId, content);
    }

    public ArticleCommentDto toDto(UserAccountDto userAccountDto) {
        return ArticleCommentDto.of(
                articleId,
                userAccountDto,
                content
        );
    }

}