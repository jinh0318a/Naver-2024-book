document.addEventListener("DOMContentLoaded", () => {
  const bookList = document.querySelector("ul.booklist");

  const onClickHandler = (e) => {
    const target = e.target;
    if (target.tagName === "SPAN") {
      const li = target.closest("LI");
      const isbn = li.dataset.isbn;

      document.location.href = `/book/detail?isbn=${isbn}`;
    }
  };

  bookList.addEventListener("click", onClickHandler);
});
