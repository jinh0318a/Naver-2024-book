document.addEventListener("DOMContentLoaded", () => {
  const bookList = document.querySelectorAll(".book-title");

  const onBookClickHandler = (e) => {
    const target = e.target.closest("li");
    if (!target) return;

    let url = `${rootPath}`;
    const isbn = target.getAttribute("data-isbn");

    url += `/book/detail?isbn=${isbn}`;

    document.location.href = url;
  };

  bookList?.forEach((item) => {
    item.addEventListener("click", onBookClickHandler);
  });
});
