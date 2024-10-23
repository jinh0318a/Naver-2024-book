document.addEventListener("DOMContentLoaded", () => {
  document.querySelectorAll(".book-title").forEach((item) => {
    item.addEventListener("click", function () {
      const isbn = this.closest("li").getAttribute("data-isbn");
      console.log(rootPath);
      console.log(isbn);
      window.location.href = `http://localhost:8080/naver/book/detail?isbn=${isbn}`;
    });
  });
});
