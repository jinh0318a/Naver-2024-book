document.addEventListener("DOMContentLoaded", () => {
  const main_nav = document.querySelector("nav.main ul");

  const onNavClickHandler = (e) => {
    const target = e.target;
    if (target.tagName !== "LI") return;

    const classList = target.classList;
    let url = `${rootPath}`;

    if (classList.contains("home")) url += "/";
    if (classList.contains("list")) url += "/book/";
    if (classList.contains("search")) url += "/book/search";
    if (classList.contains("login")) url += "/user/login";
    if (classList.contains("join")) url += "/user/join";
    if (classList.contains("mypage")) url += "/user/mypage";
    if (classList.contains("admin")) url += "/user/admin";

    document.location.href = url;
  };

  main_nav.addEventListener("click", onNavClickHandler);
});
